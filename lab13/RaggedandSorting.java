//Colin Orr
//CSE 002
//April 24, 2015
//Lab 13

//This lab will give practice in sorting and ragged arrays

public class RaggedandSorting{
    public static void main(String[]args){
        
        int [][] raggedArray = new int [5][];
        
        for(int i = 0; i<raggedArray.length; i++){
            raggedArray[i]= new int [i*3+5];
        }
        
        for(int j =0; j<raggedArray.length; j++){
            for(int k=0; k<raggedArray[j].length; k++){
                raggedArray[j][k]= (int) (Math.random()*40);
            }
        }
        
        printArray(raggedArray);

        
        for(int z = 0; z<raggedArray.length; z++){
            sortRow(raggedArray[z]);
        }
        
        System.out.println();
        
        printArray(raggedArray);
        
        System.out.println();
        
        int[][] myArray= newArray(raggedArray);
        printArray(myArray);
        
        
        
        
        
    }
    
    public static void printArray(int [][] array){
        for(int m =0; m<array.length; m++){
            System.out.print("row "+ (m+1)+": ");
            for(int n=0; n<array[m].length; n++){
                System.out.print(array[m][n]+" ");
            }
            System.out.println();
        }
        
    }
    
    
    public static void sortRow(int [] row){
        //int [] sort = new int [row.length];

        for(int x = 0; x<row.length; x++){
            int index = x;
            int temp = 0;
            for(int y =x; y<row.length; y++){
                if(row[y]<row[index]){
                    index = y;
                }
            }
            temp = row[index];
            row[index]=row[x];
            row[x]=temp;
        }
    }
    
    public static int [][] newArray(int [][] array){
        int [][] myArray = new int [array.length][array[array.length-1].length];
        for(int i= 0; i<myArray.length; i++){
            for(int j =0; j<array[i].length;j++){
                myArray[i][j]=array[i][j];
            }
            for(int k = array[i].length; k<myArray[i].length; k++){
                myArray[i][k]=0;
            }
        }
        return myArray;
        
    }

    
    
    
    
    
}
    
    
    
    
    
    
