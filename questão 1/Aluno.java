public class Aluno extends Pessoa{

    int n1, n2, n3, media;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }



    public void calcular_media(){

        media = (n1 + n2 + n3)/3;

        System.out.println("Sua media foi: "+media);

        if(media >= 7){
            System.out.println("Você passou na média");
        }else {
            System.out.println("Reprovado!");
        }
    }
}
