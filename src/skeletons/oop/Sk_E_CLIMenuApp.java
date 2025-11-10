package skeletons.oop;

public class Sk_E_CLIMenuApp
{
    public class TrackedEntity
    {
        private String name;
        private double value;

        private static int instanceCount = 0;
        private static double totalValue = 0.0;

        public TrackedEntity(String name, double value)
        {
            this.name = name;
            this.value = value;

            instanceCount++;
            totalValue += value;
        }

        public static int getInstanceCount()
        {
            return instanceCount;
        }

        public static double getTotalValue()
        {
            return totalValue;
        }
    }
}
