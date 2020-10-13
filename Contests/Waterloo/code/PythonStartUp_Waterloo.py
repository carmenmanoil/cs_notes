#usefull things for python

#quickly read in typed variables
N, M = int(input()), int(input())


# list(map(int, input().strip().split())) - makes a list of int values, e.g. [1, 4, 4, 8] 
# input().strip().split()) -> yields ["1", "4", "7", "8"] 
# map maps all the elements# of a list of strings to int
# list(map(int, input().strip().split())) yields [1, 4, 4, 8] -
grid = []# a list of lists 
for i in range(N):
    grid.append(list(map(int, input().split())))


