package skeletons.oop;

public class Sk_C_SlotAndSlotManager
{
    public class Slot
    {
        private int index;
        private EntityName content; // null = free

        public Slot(int index)
        {
            this.index = index;
            this.content = null;
        }

        public boolean isFree()
        {
            return content == null;
        }

        public void put(EntityName e)
        {
            this.content = e;
        }

        public void clear()
        {
            this.content = null;
        }

        public EntityName getContent()
        {
            return content;
        }

        @Override
        public String toString()
        {
            if (content == null)
            {
                return "Slot " + index + ": free";
            }
            return "Slot " + index + ": " + content.toString();
        }
    }

    public class SlotManager
    {
        private Slot[] slots;

        public SlotManager(int capacity)
        {
            slots = new Slot[capacity];

            for (int i = 0; i < capacity; i++)
            {
                slots[i] = new Slot(i + 1);
            }
        }

        public boolean addToFirstFree(EntityName e)
        {
            for (Slot slot : slots)
            {
                if (slot.isFree())
                {
                    slot.put(e);
                    return true;
                }
            }
            return false;
        }

        public boolean removeByKey(String key)
        {
            for (Slot slot : slots)
            {
                EntityName c = slot.getContent();
                if (c != null && key.equals(c.getName()))
                {
                    slot.clear();
                    return true;
                }
            }
            return false;
        }

        public void printAll()
        {
            for (Slot slot : slots)
            {
                System.out.println(slot);
            }
        }
    }
}
