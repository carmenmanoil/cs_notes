import sys; input=sys.stdin.readline
sub = [input().split(), input().split(), input().split()]
S, I, F = input().split()
S = int(S)
I, F = list(I), list(F)
path = [0]*(S+1)
depth = 0

def children(word, depth):
    poss = []
    for i in range(len(word)):
        for j in range(3):
            if word[i:len(sub[j][0])+i] == list(sub[j][0]):
                word[i:len(sub[j][0])+i] = list(sub[j][1])
                poss.append([word[::], depth+1, i, j])
                word[i:len(sub[j][1])+i] = list(sub[j][0])
    return poss

stack = [[I, 0, 0]]
seen = set()
while stack:
    check = stack.pop()
    if ''.join(check[0])+str(check[1]) in seen:
        continue
    seen.add(''.join(check[0])+str(check[1]))
    depth = check[1]
    path[depth] = check
    if depth == S:
        if check[0] == F:
            break
        continue
    stack.extend(children(check[0], depth))

for i in range(1, len(path)):
    print(str(path[i][3]+1) + " " + str(path[i][2]+1) + " " + ''.join(path[i][0]))
