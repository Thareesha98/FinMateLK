namespace DecoratorPattern
{

    class WhipDecorator : CoffeeDecorator
    {
        public WhipDecorator(ICoffee coffee) : base(coffee) { }

        public override string GetDescription()
        {
            return base.GetDescription() + ", Whipped Cream";
        }

        public override double GetCost()
        {
            return base.GetCost() + 2.0;
        }
    }
}