namespace DecoratorPattern
{

    class SugarDecorator : CoffeeDecorator
    {
        public SugarDecorator(ICoffee coffee) : base(coffee) { }

        public override string GetDescription()
        {
            return coffee.GetDescription() + ", Sugar";
        }

        public override double GetCost()
        {
            return coffee.GetCost() + 0.5;
        }
    }
}