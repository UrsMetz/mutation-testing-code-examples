require 'rspec'
require_relative '../lib/order_processor'

RSpec.describe 'OrderProcessor' do
  ORDER_NUMBER = 42
  QUANTITY = 1
  ARTICLE_NAME = 'name'
  ARTICLE_PRICE = 13.24
  let(:article) { OrderArticle.new(ARTICLE_NAME, ARTICLE_PRICE) }

  it 'should return created order number' do
    order_processor = OrderProcessor.new(BillingSystemDummy.new, OrderNumberProviderStub.new)

    order_number = order_processor.process_order(article, QUANTITY)
    expect(order_number).to eq ORDER_NUMBER
  end

  # it 'should notify billing system' do
  #   billing_system_mock = BillingSystemMock.new
  #   order_processor = OrderProcessor.new(billing_system_mock, OrderNumberProviderStub.new)
  #   order_processor.process_order(article, QUANTITY)
  #
  #   expect(billing_system_mock.article_name_used).to eq ARTICLE_NAME
  #   expect(billing_system_mock.article_price_used).to eq ARTICLE_PRICE
  #   expect(billing_system_mock.quantity_used).to eq QUANTITY
  # end

  class OrderNumberProviderStub
    def create_order_number
      ORDER_NUMBER
    end
  end

  class BillingSystemDummy
    def bill(article_name, article_price, quantity)
      # do nothing
    end
  end

  class BillingSystemMock
    attr_reader :article_name_used, :article_price_used, :quantity_used

    def bill(article_name, article_price, quantity)
      @article_name_used = article_name
      @article_price_used = article_price
      @quantity_used = quantity
    end
  end
end
