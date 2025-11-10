package skeletons.oop;

public class Sk_B_ArrayManager
{
    public class EntityManager
    {
        private EntityName[] items;
        private int size;

        public EntityManager(int capacity)
        {
            if (capacity < 0)
            {
                capacity = 0;
            }
            items = new EntityName[capacity];
            size = 0;
        }

        public boolean add(EntityName e)
        {
            if (e == null || size >= items.length)
            {
                return false;
            }

            items[size] = e;
            size++;
            return true;
        }

        public EntityName[] getAll()
        {
            EntityName[] result = new EntityName[size];

            for (int i = 0; i < size; i++)
            {
                result[i] = items[i];
            }

            return result;
        }

        public EntityName[] findByName(String name)
        {
            if (name == null || size == 0)
            {
                return new EntityName[0];
            }

            int count = 0;
            for (int i = 0; i < size; i++)
            {
                if (name.equals(items[i].getName()))
                {
                    count++;
                }
            }

            EntityName[] result = new EntityName[count];
            int index = 0;

            for (int i = 0; i < size; i++)
            {
                if (name.equals(items[i].getName()))
                {
                    result[index] = items[i];
                    index++;
                }
            }

            return result;
        }

        public int getTotalValue()
        {
            int total = 0;

            for (int i = 0; i < size; i++)
            {
                total += items[i].getValue();
            }

            return total;
        }
    }
}
