package practica6;

/**
 * @author Agustin Bettati
 * @author Marcos Khabie
 * @version 1.0
 */
public class Ex4Solved implements Exercise4{

    private class NodeImpl implements Node<Double>{
        private int row;
        private int col;
        private double value;

        public NodeImpl(int row, int col, double value) {
            this.row = row;
            this.col = col;
            this.value = value;
        }

        @Override
        public int getRow() {
            return row;
        }

        @Override
        public int getColumn() {
            return col;
        }

        @Override
        public Double getValue() {
            return value;
        }
    }

    @Override
    public Node[] summation(Node[] matrixA, Node[] matrixB, Calculator calculator) {
        Node[] resultMatrix = new Node[matrixA.length];

        for (int i = 0; i < resultMatrix.length; i++) {
            resultMatrix[i] = new NodeImpl(matrixA[i].getRow(), matrixA[i].getColumn(),
                    calculator.sum((int)matrixA[i].getValue(), (int)matrixB[i].getValue()));
        }

        return resultMatrix;
    }
}
