def find_chair(meeting_room_list: list, total_required_chairs: int):
    if total_required_chairs == 0:
        return 1
    spare_chairs = []
    for room in meeting_room_list:
        total_chairs, total_occupants =  room[1], len(room[0]),
        spare_chairs.append(total_chairs-total_occupants)
        total_required_chairs -= (total_chairs-total_occupants)
        if total_required_chairs == 0:
            return spare_chairs
    return 0