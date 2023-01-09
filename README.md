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

Solution:
[FindAChair.txt](https://github.com/Aryanx097/Find-A-Chair/files/10373140/FindAChair.txt)

//Cpp code for FindAChair
#include <iostream>
#include <tuple>
#include <list>
#include <vector>
using namespace std;

vector<int> findChair(list<tuple<string, int>> rooml, int chairNeed)
{
    vector<int> takeChair;
    int chAvail;
    for (auto it = rooml.begin(); it != rooml.end(); it++)
    {
        chAvail = get<1>(*it) - get<0>(*it).length();
        if (chAvail > 0)
        {
            if (chairNeed > chAvail)
            {
                chairNeed -= chAvail;
                takeChair.push_back(chAvail);
            }
            else
            {
                takeChair.push_back(chairNeed);
                return takeChair;
            }
        }
        else
            takeChair.push_back(0); // chair not available
    }
    return {0}; // not enough chair
}

int main()
{
    tuple<string, int> room;
    list<tuple<string, int>> roomlist;
    int chair, NumOfRooms;

    cout << "Number of Rooms: ";
    cin >> NumOfRooms;
    cout << endl;

    string st;
    int ch;
    for (int i = 0; i < NumOfRooms; i++)
    {
        cin >> st >> ch;
        room = make_tuple(st, ch);
        roomlist.push_back(room);
    }

    cout << "\nChairs Needed: ";
    cin >> chair;

    vector<int> vct = findChair(roomlist, chair);
    if (chair > 0)
    {
        for (auto ele : vct)
            cout << ele << " ";
    }
    else
        cout << 1 << endl; // no chair needed

    return 0;
}
