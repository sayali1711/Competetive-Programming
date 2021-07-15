//Function to search a given number in row-column sorted matrix.
//Given a matrix of size n x m, where every row and column is sorted in increasing order, and a number x. Find whether element x is present in the matrix or not.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    
	    for(int i=0;i<n;i++){
	        int j=m-1;
	        if(matrix[i][m-1]==x || matrix[i][0]==x){
	            return true;
	        }
	         else if(matrix[i][0]<x && matrix[i][m-1]>x){
	            while(j>=0){
	                if(matrix[i][j]==x){
	                    return true;
	                }
	                else{
	                       j--; 
	                }
	            
	            }
	        }
	        else if(matrix[i][m-1]>x){
	         continue;
	        }
	       
	        
	    }
 return false;
 } 
} 
