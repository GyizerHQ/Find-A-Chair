So you've found a meeting room - phew! You arrive there ready to present, and find that someone has taken one or more of the chairs!! 
You need to find some quick.... check all the other meeting rooms to see if all of the chairs are in use.
Your meeting room can take up to 8 chairs. need will tell you how many have been taken. You need to find that many.

Find the spare chairs from the array of meeting rooms. 
Each meeting room tuple will have the number of occupants as a string. 
Each occupant is represented by `'X'`. The **room tuple** will also have an integer telling you how many chairs there are in the room.

You should return an **array of integers** that shows how many chairs you take from each room in order, up until you have the **required amount**.

```
example:

[['XXX', 3], ['XXXXX', 6], ['XXXXXX', 9], ['XXX',2]] when you need 4 chairs:

result -> [0, 1, 3] 
no chairs free in room 0, take 1 from room 1, take 3 from room 2. no need to consider room 3 as you have your 4 chairs already.
```

If you need no chairs, return `1`. If there aren't enough spare chairs available, return `0`.


## **Python Solution :**

```
def solve(list,chairs_needed): # Function to solve question
    if chairs_needed==0 :
        print("No chairs needed")
        # Return 1 as mentioned in question
        return 1
    res = [] # Result array which return array of integers 
    for i in list:
        available = (i[1]-len(i[0])) # Available chairs 
        if available>0 :
            if chairs_needed>available:
                res.append(available)
                chairs_needed-=available
            else : 
                res.append(chairs_needed)
                return res
        else : 
            res.append(0)
    
    print("There aren't spare chairs available")
    # Return 0 as mentioned in question
    return 0

list = [['XXX', 4], ['XXXXX', 6], ['XXXXXX', 9], ['XXX',2]]
chairs = 3
print(solve(list,chairs))
```
