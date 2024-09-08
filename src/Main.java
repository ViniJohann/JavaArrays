public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[5];

        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 100;

        System.out.println("Elementos do array 'vetor: ");
        for (int i = 0; i < vetor.length; i++ ){
            System.out.println("Elemento na posição "+i+": "+vetor[i]);
        }

        int soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }

        System.out.println("A soma do array 'vetor é: "+soma);

        int max = vetor[0];
        for (int value: vetor){
            if(value > max){
                max = value;
            }
        }

        System.out.println("O maior elemento do array 'vetor é: "+max);


        //Reverta o Array:

        int[] InvertedArray = new int[vetor.length];
        int counter = 0;
        for(int i = vetor.length-1; i >= 0; i--){
            InvertedArray[counter] = vetor[i];
            counter++;
        }
            //Imprime o vetor invertido:
        System.out.println("\nElementos do array 'vetor, invertidos: ");

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Elemento na posição "+i+": "+InvertedArray[i]);
        }

        //Adicionar elementos a um array:
        int[] addElements = {110, 120, 130, 140, 200};
        int newVetor[] = new int[vetor.length + addElements.length];
        counter = 0;

        for(int i = 0; i < newVetor.length; i++){
            if( i < vetor.length){
                newVetor[i] = vetor[i];
            }else {
                newVetor[i] = addElements[counter];
                counter++;
            }
        }
        System.out.println("\nElementos do array 'vetor, após a inserção dos novos elementos: ");

        for(int i = 0; i < newVetor.length; i++){
            System.out.println("Elemento na posição "+i+": "+newVetor[i]);
        }

        //Excluir elementos de um array:
        int deleteElement = 100;
        counter = 0;

            //Contar quantos elementos excluir
        for(int i = 0; i < vetor.length; i++){
            if(deleteElement == vetor[i]){
                counter++;
            }
        }

        int[] newVetor2 = new int[vetor.length - counter];
        counter = 0;

            //Criando novo array sem os elementos excluidos
        for(int i = 0; i < vetor.length; i++){
            if(deleteElement != vetor[i]){
                newVetor2[counter] = vetor[i];
                counter++;
            }
        }
        System.out.println("\nElementos do array 'vetor, após deletar os elementos = "+deleteElement+": ");

        for(int i = 0; i < newVetor2.length; i++){
            System.out.println("Elemento na posição "+i+": "+newVetor2[i]);
        }

        //Pesquisando elementos
        System.out.println("\nPesquisando elementos:");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == 10){
                System.out.println("Elemento encontrado na posição: "+i);
            }
        }


        int[][] matriz = {
                {10, 20, 30},
                {30, 50, 60},
                {70, 80, 90}
        };

        for(int[] row : matriz){
            for(int value: row){
                System.out.print(value+ " ");
            }
            System.out.println();
        }

        int n = matriz.length;
        int[][] rotacionada = new int[n][n];

        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                rotacionada[j][n -1 -i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz rotacionada 90 graus:");
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(rotacionada[i][j]+ " ");
            }
            System.out.println();
        }

        int sum = 0;
        int sumSecondary = 0;

        for(int i = 0; i< matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j){
                    sum+= matriz[i][j];
                }
                if((i + j) == matriz.length -1){
                    sumSecondary += matriz[i][j];
                }
            }
        }
        System.out.println("Soma principal: "+sum);
        System.out.println("Soma secundária: "+sumSecondary);

        //Buscar elemento em Matriz:

        int elementToFind = 20;
        counter = 0;

        System.out.println("\nProcurando o elemento "+elementToFind+" no Array:");
        for(int i = 0; i< matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if( elementToFind == matriz[i][j]){
                    counter++;
                    System.out.println(counter+"° elemento encontrado na posição: "+i+", "+j);
                }
            }
        }
        if (counter == 0){
            System.out.println("Nenhum elemento encontrado no Array!");
        }
    }
}
