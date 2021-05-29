/*A program that builds a graph from a file, takes the filename and vertices as input 
arguments on the command line and prints out the graph using the data from the file*/

public class Graph
{
   private ST<String, SET<String>> st;
	private String[] keys;
	private Graph graph;
	
   public Graph(String filename, String delimiter) {//initializes the graph from file
    st = new ST<String, SET<String>>();  }
	In in = new In(filename);//reads string and builds index
        while (!in.isEmpty()) {
            String[] a = in.readLine().split(delimiter);
            for (int i = 0; i < a.length; i++) {
                if (!st.contains(a[i]))
                    st.put(a[i], st.size());
			}
		}
		keys = new String[st.size()];//get string keys 
        for (String name : st.keys()) {
            keys[st.get(name)] = name;
		}
		graph = new Graph(st.size());//builds the graph by connecting vertices
        in = new In(filename);
        while (in.hasNextLine()) {
            String[] a = in.readLine().split(delimiter);
            int v = st.get(a[0]);
            for (int i = 1; i < a.length; i++) {
                int w = st.get(a[i]);
                graph.addEdge(v, w);
			}
		}
   public static void main(String[] args)
   {  // Read edges from standard input; print resulting graph.
      Graph G = new Graph();
      while (!StdIn.isEmpty())
         G.addEdge(StdIn.readString(), StdIn.readString());
      StdOut.print(G);
   }
}
