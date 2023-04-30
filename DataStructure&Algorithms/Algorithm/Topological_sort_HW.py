def Topological_sort(start,graph):
    visited=[False for i in range(len(graph))]
    
    for v in visited:
        if(not v):                  # not visited
            DFS(start,visited,graph)
        start+=1
    
    
def DFS(index,visited,graph):   #depth first search
    visited[index]=True
    r=[]
    for i in graph[index]:
        if(not visited[i]):
            DFS(i,visited,graph)
    r.append(graph.index(graph[index]))
    print(r[0])
    
Graph_=[(0, 1), (1, 4), (1, 3), (1, 5), (2, 3), (2, 4), (3, 5), (4, 5)]
Topological_sort(0,Graph_)