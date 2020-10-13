import sys; input=sys.stdin.readline
n = sorted(input()[:-1])
N = set(n)
H = input()[:-1]
seen = set()
starter = {}
for i in range(len(n)):
    if n[i] not in starter:
        starter[n[i]] = -1
    else:
        starter[n[i]] = starter.get(n[i])-1

def helperCreator(arr):
    amounts = []
    amount = 1
    for i in range(len(arr)-1):
        if arr[i] != arr[i+1]:
            amounts.extend([amount]*amount)
            amount = 1
        else:
            amount += 1
    amounts.append(amount)
    return amounts

helper = helperCreator(H)

def isPerm(string):
    vals = dict(starter)
    for char in string:
        if char not in vals:
            return False
        vals[char] = vals.get(char)+1
    if set(vals.values()) == {0}:
        return True
    return False
at = 0
while at < len(H):
    if H[at] in N:
        if H[at:len(n)+at+1] not in seen:
            if isPerm(H[at:len(n)+at]):
                seen.add(H[at:len(n)+at])
        at += 1
    else:
        at += helper[at]
print(len(seen))
