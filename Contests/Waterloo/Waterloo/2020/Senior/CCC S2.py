### CCC2020S2 - EscareRoom - Mark Bedaywi
import sys; input=sys.stdin.readline
#quickly read in typed variables
N, M = int(input()), int(input())

grid = []
for i in range(N):
    grid.append(list(map(int, input().split())))


memory = {} # this creates an empty dictionary, an entry is a pair key - a list, 
e.g. 8(key) - [(1, 8),(8, 1), (2, 4), (4, 2)]
def factors(n):
    # if n has already been added to dictionary just return its factors as a list
    if n in memory:
        return memory[n]
    facts = []
    #Algorithms 
    for k in range(1, int(n**0.5)+1):
        if n % k == 0:
            if k <= N and n//k <= M:
                facts.append((k, n//k))
            if k <= M and n//k <= N:
                facts.append((n//k, k))
    memory[n] = facts
    return facts

def children(point):
    return factors(grid[point[0]-1][point[1]-1])

def dfs(point):
    seen = set() # this creates an empty set - the elements are maintained sorted in a set
    stack = children(point)
    while stack:
        check = stack.pop()
        if check in seen:
            continue
        seen.add(check)
        stack.extend(children(check))
        if check[0] == N and check[1] == M:
            return True
    return False

if dfs((1, 1)):
    print("yes")
else:
    print("no")
