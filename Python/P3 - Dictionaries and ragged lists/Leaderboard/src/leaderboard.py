from datetime import timedelta


def init_leaderboard() -> dict[str, timedelta]:
    leaderboard = {}
    return leaderboard


def add_player(leaderboard, player_name):
    if player_name in leaderboard:
        return True
    else:
        return False


def add_run(leaderboard, player_name, time):
    if time < 0:
        return 1
    elif player_name not in leaderboard:
        return 2
    else:
        if not (time > leaderboard[player_name]):
            leaderboard[player_name] = time
        return 0


def clear_score(leaderboard, player_name):
    if player_name not in leaderboard:
        return False
    else:
        leaderboard[player_name] = None
        return True


def display_leaderboard(leaderboard, n=3):
    sorted_leaderboard = dict(sorted(leaderboard.items(), key=lambda item: item[1]))
    for i in range(n):
        print(sorted_leaderboard[i])


def calculate_average_time():
    if len(leaderboard) == 0:
        return (False, None)
    else:
        average_time = sum(leaderboard.values()) / len(leaderboard)
        return (True, average_time)
