package test;

public class Graph {
    final int NUM_VERTEX_MAX = 100;
    int [] vertex = new int [NUM_VERTEX_MAX];
    int numVertex;
    int [][] edge = new int [NUM_VERTEX_MAX][2];
    int numEdges;
    
    public Graph () {
        
    }

    public Graph(int numVertex) {
        setVertex(numVertex);
    }
    
    public void setVertex (int numVertex) {
        this.numVertex = numVertex;
        
        for (int i = 0; i < numVertex; i++) this.vertex[i] = i;
    }

    @Override
    public String toString() {
        String out = "Graph Vertex: ";
        
        for (int i = 0; i < numVertex; i++) out += i + ", ";
        
        return out;
    }
    
    
}
