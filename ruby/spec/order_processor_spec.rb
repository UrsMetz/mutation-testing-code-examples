require 'rspec'
require_relative '../lib/order_processor'

RSpec.describe 'OrderProcessor' do
  ORDER_NUMBER = 42
  QUANTITY = 1
  ARTICLE_NAME = 'name'
  let(:billing_system) { double('billing system') }
  let(:order_number_provider) { double('order number provider') }
  ARTICLE_PRICE = 13.24
  let(:article) { OrderArticle.new(ARTICLE_NAME, ARTICLE_PRICE) }

  it 'should return created order number' do
    billing_system.as_null_object
    expect(order_number_provider).to receive(:create_order_number) { ORDER_NUMBER }

    order_processor = OrderProcessor.new(billing_system, order_number_provider)

    order_number = order_processor.process_order(article, QUANTITY)
    expect(order_number).to eql ORDER_NUMBER
  end

  # it 'should notify billing system' do
  #   expect(billing_system).to receive(:bill).with(ARTICLE_NAME, ARTICLE_PRICE, QUANTITY)
  #   order_number_provider.as_null_object
  #
  #   order_processor = OrderProcessor.new(billing_system, order_number_provider)
  #   order_processor.process_order(article, QUANTITY)
  # end
end
