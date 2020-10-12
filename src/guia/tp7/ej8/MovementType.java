package guia.tp7.ej8;

public enum MovementType{
        DEPOSIT("Deposit "),
        EXTRACTION("Extraction ");
        public String type;

        MovementType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return type;
        }
}