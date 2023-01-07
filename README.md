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


Here my solution of this question---


# According to the question firstly we have given an list of rooms and numbers of required chair...

List1=[['XXX', 3], ['XXXXX', 6], ['XXXXXX', 9], ['XXX',2]]

required_chairs=4


# According to question meeting room can take up to 8 chairs...
# And we have your 4 chairs already...and here find needed chais
# There is solution of this question...

# Find_chairs() function return needed chars or required chairs

# If you need no chairs, return 1. If there aren't enough spare chairs available,return 0.

def find_chairs(list1,needed_chair):
    if needed_chair==0:
        return 1
    sum=0
    list_of_chairs=[]
    for i in list1:
        chair=i[1]-len(i[0])
        list_of_chairs.append(chair)
        sum=sum+chair
        if sum==needed_chair:
            return list_of_chairs
            break;
    if sum < needed_chair:
        return 0

# Function Calling

Ans_list=find_chairs(List1,required_chairs)
print(Ans_list)
        
        
