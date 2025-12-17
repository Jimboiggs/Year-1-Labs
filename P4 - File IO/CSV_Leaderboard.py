from datetime import timedelta
import csv

def init_leaderboard() -> dict[str, timedelta]:
    leaderboard = {}
    return leaderboard


def add_player(leaderboard, player_name):
    if player_name in leaderboard:
        return False
    else:
        leaderboard[player_name] = None
        return True


def add_run(leaderboard, player_name, time):
    if time < timedelta(0):
        return 1
    elif player_name not in leaderboard:
        return 2
    else:
        current_time = leaderboard[player_name]
        # Only compare if there's an existing time
        if current_time is None or time <= current_time:
            leaderboard[player_name] = time
        return 0


def clear_score(leaderboard, player_name):
    if player_name not in leaderboard:
        return False
    else:
        leaderboard[player_name] = None
        return True


def display_leaderboard(leaderboard, n=3):
    valid_entries = {k: v for k, v in leaderboard.items() if hasattr(v, "total_seconds")}
    sorted_leaderboard = dict(sorted(valid_entries.items(), key=lambda item: item[1]))

    if not sorted_leaderboard:
        print("No times recorded yet.")
        return

    for rank, (name, time) in enumerate(list(sorted_leaderboard.items())[:n], start=1):
        print(f"{rank}. {name} - {time}")


def calculate_average_time(leaderboard):
    valid_times = [t for t in leaderboard.values() if isinstance(t, timedelta)]
    if not valid_times:
        return (False, None)
    average_time = sum(valid_times, timedelta()) / len(valid_times)
    return (True, average_time)

def export_leaderboard(leaderboard, destination):
    try:
        with open(destination, "w", newline="") as csvfile:
            writer = csv.writer(csvfile)
            writer.writerow(["Name", "Duration"])

            for player, time in leaderboard.items():
                if isinstance(time, timedelta):
                    total_seconds = int(time.total_seconds())
                    hours, remainder = divmod(total_seconds, 3600)
                    minutes, seconds = divmod(remainder, 60)
                    writer.writerow([player, hours, minutes, seconds])
                else:
                    # Player has no recorded time
                    writer.writerow([player, "", "", ""])
    except Exception as e:
        raise ValueError("Error writing leaderboard file") from e
