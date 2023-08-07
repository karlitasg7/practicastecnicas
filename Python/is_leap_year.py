def is_leap_year(year):
    if year < 0:
        return False

    is_divisible_4 = (year % 4) == 0
    is_divisible_100 = (year % 100) == 0
    is_divisible_400 = (year % 400) == 0

    if (is_divisible_4 and not is_divisible_100) or (is_divisible_100 and is_divisible_400):
        return True
    else:
        return False


print(is_leap_year(2000))  # True
print(is_leap_year(-2023))  # False
print(is_leap_year(1984.25))  # False
