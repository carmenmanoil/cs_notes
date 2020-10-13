import sys; input=sys.stdin.readline
word = input()[:-1]
check = ''.join(sorted(word))
minimum = float('inf')

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

helper = helperCreator(word)

def loop(amount, word):
    return word[-amount:] + word[:-amount]

for i in range(len(word)):
    count = 0
    for j in range(len(word)):
        if word[j] != check[j]:
            count += 1
    if count < minimum:
        minimum = count
    check = loop(helper[i], check)
if minimum % 2 == 0:
    print(minimum//2)
else:
    print(1+(minimum//2))
