'''      !! grid Modified !!         '''

import heapq
import math
#heap Queue data structure(priority Queue)
#use tuple for grid (x,y)
class Queue(object):
    def __init__(self):
        self.elements=[]
        
    def length(self):
        return len(self.elements)
    
    def push(self,x,priority):
        return heapq.heappush(self.elements,(priority,x))
    
    def pop(self):
        return heapq.heappop(self.elements)[1]

#used euclidean distance
def huristic_euclidean(goal,next):
    (x1,y1)=goal
    (x2,y2)=next
        
    dx=x1-x2
    dy=y1-y2
    return math.sqrt(dx*dx+dy*dy)

#used manhattan distance
def huristic_manhattan(goal,next):
    (x1,y1)=goal
    (x2,y2)=next
    
    return abs(x1-x2)+abs(y1-y2)

def calc_cost(current,next,cost_used,grid):
    (x,y)=next
    return cost_used[current]+grid[y][x]

def solution(start,goal,grid):
    queue=Queue()
    queue.push(start,0)         #set priority 0 (0 = node data = priority)

    came_from={}
    cost_used={}
    cost_used[start]=0          #set start point cost = 0 (constant)
    
    while queue.length():       #while true (length>0)
        current=queue.pop()
        (x,y)=current
        candidate=[(x+1,y),(x,y+1),(x-1,y),(x,y-1)]
        if current==goal:
            break
        
        for next in [(h,v) for h,v in candidate if grid[v][h] != 0]:    #list if next by candidate
            new_cost=calc_cost(current,next,cost_used,grid)
            
            if (next not in cost_used) or (new_cost < cost_used[next]):
                queue.push(next,new_cost+huristic_manhattan(goal,next))     #set node data distance next->goal **(A* Algorithm)
                cost_used[next]=new_cost
                came_from[next]=current
    
    current=goal
    path=[]
    while current != start:
        path.append(current)
        current=came_from[current]
    #make reversed path
    path.reverse()
    
    return path

#grid
grid = [ [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ],
         [ 0, 1, 1, 1, 2, 1, 1, 2, 1, 0 ],
         [ 0, 3, 0, 1, 0, 0, 2, 0, 1, 0 ],
         [ 0, 3, 1, 1, 1, 0, 1, 0, 2, 0 ],
         [ 0, 0, 1, 1, 1, 1, 1, 1, 1, 0 ],
         [ 0, 1, 1, 0, 1, 1, 1, 0, 2, 0 ],
         [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ] ]

start=(1,5)
goal=(8,1)
        
print(solution(start,goal,grid))


'''
start=(1,5) / goal=(8,1)
manhattan distance
(2, 5), (2, 4), (3, 4), (4, 4), (5, 4), (6, 4), (7, 4), (8, 4), (8, 3), (8, 2), (8, 1)
euclidean distance
(2, 5), (2, 4), (3, 4), (4, 4), (5, 4), (6, 4), (7, 4), (8, 4), (8, 3), (8, 2), (8, 1)


start=(1,1) / goal=(8,5)
manhattan distance
(2, 1), (3, 1), (3, 2), (3, 3), (3, 4), (4, 4), (5, 4), (6, 4), (7, 4), (8, 4), (8, 5
euclidean distance
(2, 1), (3, 1), (3, 2), (3, 3), (4, 3), (4, 4), (5, 4), (6, 4), (7, 4), (8, 4), (8, 5)
'''