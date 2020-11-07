package parcial2.repaso.ej6;

public enum QuotaType {
    LIMITED{
        @Override
        public boolean canRead(int amount) {
            return amount < 2;
        }

        @Override
        public boolean canWrite(int amount) {
            return amount < 1;
        }
    },
    UNLIMITED(){
        @Override
        public boolean canRead(int amount) {
            return true;
        }

        @Override
        public boolean canWrite(int amount) {
            return true;
        }
    };

    public abstract boolean canRead(int amount);
    public abstract boolean canWrite(int amount);

}
