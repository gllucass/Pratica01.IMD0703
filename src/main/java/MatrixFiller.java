class MatrixFiller {
    public char[][] InitializeMatrix(String world) {
        int line = 6;
        int colunm = 5;
        int k=0;
        char[][] ArrayCodified = new char[line][colunm]; 
       
        for(int j=0;j<colunm;j++){
            for(int i=0; i<line;i++){
                ArrayCodified[i][0] = world.charAt(k);
                k++;
            }
        }
        return ArrayCodified;
    }
}