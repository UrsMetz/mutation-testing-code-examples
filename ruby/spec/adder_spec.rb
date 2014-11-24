require 'rspec'
require_relative '../lib/adder'

RSpec.describe 'Adder' do

  let(:adder) { Adder.new }
  it 'should add two numbers' do
    sum = adder.add(0, 0)
    expect(sum).to eql 0
  end
end
