#node class (BST node + color inner parameter)
class node:
    def __init__(self,Value):
        self.parent=None    
        self.color=False    #false => black (default) / true=> red
        self.right=None 
        self.left=None
        self.key=Value      # get input(key Value)
        
class RB_Tree:
    def __init__(self,node) :
        ##constructor
        self.nil=Node(None)
        self.root=nil
        
    def left_rotate(self,x):
        ##rotate left
        y=x.right
        x.right=y.left
        if y.left!=self.nil:    ## **node(None)==nil
            y.left.parent=x
        y.parent=x.parent
        if x.parent==None:      # if x is root node
            root=y
        elif x==x.parent.right: # if x is right child
            x.parent.right=y
        else: x.parent.left=y   #if x is left child
        y.left=x
        x.parent=y  
        
    def right_rotate(self,x):
        ## rotate right
        y=x.left
        x.left=y.right
        if y.right!=self.nil:
            y.right.parent=x.parent
        y.parent=x.parent
        if x.parent==None:
            root=y
        elif x==x.parent.right:
            x.parent.right=y
        else:
            x.parent.left=y
        y.right=x
        x.parent=y
               
    def insert(self,node):      #node--> key value
        ## insert function
        
    
    def delete(self,node):
        ## delete node    
     
    def search(self,node):
        ## search function
