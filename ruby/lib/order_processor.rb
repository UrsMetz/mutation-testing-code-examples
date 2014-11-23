class OrderProcessor
  def initialize(billing_system, order_number_provider)
    @billing_system = billing_system
    @order_number_provider = order_number_provider
  end

  def process_order(article, quantity)
    @billing_system.bill(article.name, article.price, quantity)
    @order_number_provider.create_order_number()
  end
end

class OrderArticle
  attr_reader :name, :price
  def initialize(name, price)
    @name = name
    @price = price
  end
end
