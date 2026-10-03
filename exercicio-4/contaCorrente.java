public class contaCorrente {
        private int numero;
        private String titular;
        private float saldo;


        public contaCorrente(int numero, String titular) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = 0.0f;
        }


        public boolean sacar(float valor) {
            if (valor > 10000) {
                System.out.println("Não é permitido sacar mais de 10000 por operação.");
                return false;
            }
            if (valor > 0 && this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso.");
                return true;
            } else {
                System.out.println("Saldo insuficiente ou valor inválido.");
                return false;
            }
        }


        public boolean depositar(float valor) {
            if (valor > 0 && valor <= 10000) {
                this.saldo += valor;
                System.out.println("Depósito realizado com sucesso.");
                return true;
            } else {
                System.out.println("O valor deve ser positivo e não superior a 10000.");
                return false;
            }
        }


        public float consultarSaldo() {
            return this.saldo;
        }
}

