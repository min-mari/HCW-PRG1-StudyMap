package skeletons.oop;

public class Sk_A_Entity
{
    public class EntityName
    {
        private String name;
        private int value;

        public EntityName(String name, int value)
        {
            this.name = name;
            this.value = value;
        }

        public String getName()
        {
            return name;
        }

        public int getValue()
        {
            return value;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public void setValue(int value)
        {
            this.value = value;
        }

        @Override
        public String toString()
        {
            return name + " (" + value + ")";
        }
    }
}
