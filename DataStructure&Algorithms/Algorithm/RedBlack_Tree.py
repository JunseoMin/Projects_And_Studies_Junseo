#node class (BST node + color inner parameter)
class node:
    def __init__(self,Value):
        self.parent=None    
        self.color=True    #True => black (default) / False => red
        self.right=None 
        self.left=None
        self.key=Value      # get input(key Value)
 
        
class RB_Tree:
    
    def __init__(self,node) :
        ##constructor
        self.nil=node(None)
        self.root=nil
        
    def BST_insert(self,inp_node,B_node):  #BST insert-> after fix-up 
        if(root==nil):                     # if tree empty
            root=inp_node.key
            
        if(inp_node.key<B_node.key):        #check left child
            if(B_node.left):
                B_node.left=inp_node        # end reculsion
            else:
                B_node=B_node.left
                BST_insert(self,inp_node,B_node)
        else:
            if(B_node.right):
                B_node.right=inp_node       # end reculsion
            else:
                B_node=B_node.right
                BST_insert(self,inp_node,B_node)       
            
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
               
    def insert(self,inp_node):                                  # input: node value
        ## insert function
        BST_insert(self,inp_node,root)                          # get input (BST style)
        while(inp_node.parent.color):                           # black == True
            if(inp_node.parent==inp_node.parent.parent.right):  # check right child
                U=inp_node.parent.parent.right
                if(not U.color):                                # color=red
                    U.color=True
                    inp_node.parent.color=True                  
                    inp_node.parent.parent.color=False
                    inp_node=inp_node.parent.parent
                elif inp_node==inp_node.parent.left:
                    inp_node=inp_node.parent
                    right_rotate(inp_node)
                inp_node.parent.color=True
                inp_node.parent.parent.color=False
                left_rotate(inp_node)
                
            else:
                if(inp_node.parent==inp_node.parent.parent.left):  # check left child
                    U=inp_node.parent.parent.left
                    if(not U.color):                                # color=red
                        U.color=True
                        inp_node.parent.color=True                  
                        inp_node.parent.parent.color=False
                        inp_node=inp_node.parent.parent
                elif inp_node==inp_node.parent.right:
                    inp_node=inp_node.parent
                    left_rotate(inp_node)
                inp_node.parent.color=True
                inp_node.parent.parent.color=False
                right_rotate(inp_node)
        root.color=True
                       
     
    def search(self, tree, k):
        if tree.key == None or k == tree.key:
            return tree
     
        if k < tree.key:
            return self.search(tree.left, k)
        else:
            return self.search(tree.right, k)
