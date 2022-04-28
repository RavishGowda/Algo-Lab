import java.io.*;
import java.util.*;

class BFSTraversal
{
    private int V;                              //number of nodes in the graph
    private LinkedList<Integer> adj[];              //adjacency list
    private Queue<Integer> queue;                   //maintaining a queue
 
    BFSTraversal(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }

 
    void addEdge(int v,int w)
    {
        adj[v].add(w);                          //adding an edge to the adjacency list (edges are bidirectional in this example)
    }
 
    void BFS(int n)
    {

        boolean nodes[] = new boolean[V];       //initialize boolean array for holding the data
        int a = 0;
 
        nodes[n]=true;                  
        queue.add(n);                   //root node is added to the top of the queue
 
        while (queue.size() != 0)
        {
            n = queue.poll();             //remove the top element of the queue
            System.out.print(n+" ");           //print the top element of the queue
 
            for (int i = 0; i < adj[n].size(); i++)  //iterate through the linked list and push all neighbors into queue
            {
                a = adj[n].get(i);
                if (!nodes[a])                    //only insert nodes into queue if they have not been explored already
                {
                    nodes[a] = true;
                    queue.add(a);
                }
            }  
        }
    }

    public static void main(String args[])
    {
    	BFSTraversal graph = new BFSTraversal(10);
    	 
         /*graph.addEdge(0, 0);
         graph.addEdge(0, 2);
         graph.addEdge(0, 3);
         graph.addEdge(3, 4);
         graph.addEdge(2, 4);
         graph.addEdge(0, 1);
         graph.addEdge(0, 0);
         graph.addEdge(1, 0);
         graph.addEdge(3, 0);
         graph.addEdge(2, 0);
         graph.addEdge(4, 3);
         graph.addEdge(4, 2);
         */
    	 
    	 graph.addEdge(0, 1);
         graph.addEdge(0, 2);
         graph.addEdge(1, 2);
         graph.addEdge(1, 3);
         graph.addEdge(1, 4);
         graph.addEdge(2, 5);
         graph.addEdge(2, 6);
         graph.addEdge(3, 4);
         graph.addEdge(3, 7);
         graph.addEdge(3, 8);
         graph.addEdge(5,6);
         graph.addEdge(4, 8);
         graph.addEdge(7, 8);
         graph.addEdge(8, 9);
         
         graph.addEdge(1, 0);
         graph.addEdge(2, 0);
         graph.addEdge(2, 1);
         graph.addEdge(3, 1);
         graph.addEdge(4, 1);
         graph.addEdge(5, 2);
         graph.addEdge(6, 2);
         graph.addEdge(4, 3);
         graph.addEdge(7, 3);
         graph.addEdge(8, 3);
         graph.addEdge(6, 5);
         graph.addEdge(8, 4);
         graph.addEdge(8, 7);
         graph.addEdge(9, 8);
         
         
  
         System.out.println("The Breadth First Traversal of the graph is as follows :");
  
         graph.BFS(0);
    }
}