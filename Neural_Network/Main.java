class Main {    
    public static void main(String [] args) {        
        NeuralNetwork nn = new NeuralNetwork(2, 10, 1);
        
        double[][] training_data_in = nn.getFileData("training_data_in.txt");
        double[][] training_data_out = nn.getFileData("training_data_out.txt");
        
        double[][] testing_data_in = nn.getFileData("testing_data_in.txt");
        double[][] testing_data_out = nn.getFileData("testing_data_out.txt");

        int epochs = 50000;
        nn.fit(training_data_in,training_data_out,epochs,0);
        
        nn.testData(training_data_in,training_data_out);
    }
}
