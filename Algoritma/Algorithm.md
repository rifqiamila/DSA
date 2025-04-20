## A. PENGERTIAN ALGORITMA
  Langkah-langkah dari suatu instruksi untuk solve suatu masalah dan mencapai tujuan tertentu
---
## B. KARAKTERISTIK AlGORITMA
  1. Finite (terbatas) = ada titik akhirnya, jadi program gak berjalan terus
  2. Define (terdefinisi) = Memenuhi definisi tertentu
  3. Computable.
----
## C. CONTOH ALGORITMA
  ### 1. GCD
     ```java
     public static int mod(int a, int b){
          if ((a%b) == 0){
              return b;
          } 
  
          return mod(b, (a%b));
      }
      ```
  ### 2. Bubble sort
      ```java
      for (int i = 0; i < angka.length-1; i++){
              for (int j = 0; j < angka.length-1-i; j++){
                  int temp;
                  // meningkat
                  if (angka[j] > angka[j+1]){
                      temp = angka[j];
                      angka[j] = angka[j+1];
                      angka[j+1] = temp;
                  }
              }
          }
      ```
  ### 3. Factorial
     ```java
     public static int fact(int a){
          if (a == 0 || a == 1){
              return a;
          }
  
          return(a*fact(a-1));
      }
    ```
   
