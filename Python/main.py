from car import Car
from account import Account
if __name__ == "__main__":

    car = Car("AMS23",Account("fernando torres","MOB-01"))
    print(vars(car))
    print(vars(car.driver))