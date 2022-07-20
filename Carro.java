class Carro {
    String cor;
    String modelo;
    int tanque;
    

    Carro(){ //Construtor da classe carro
}

    Carro(String cor, String modelo, int tanque){ //Sobreescrevendo construtor da classe carro
        this.cor = cor;
        this.modelo = modelo;
        this.tanque = tanque;
    }

    public String getCor() {
        return cor;
    }    

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }


    public Double calculaTanque(){
        return tanque * 4.60;
    }

    }
