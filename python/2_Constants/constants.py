import math 
from typing import Final
import enum from Enum

#mathematical constants

PI: Final[float] = math.pi
E: Final[float] = math.e
Gravity: Final[float] = 9.8


#Configuration constants

MAX_CONNECTIONS: Final[int] = 100
DEFAULT_TIMEOUT: Final[float] = 20.0
SUPPORTED_LANGUGAES: Final[tuple] = ("Java","Python","C")


#Database constants

DB_HOST: Final[str] = "localhost"
DB_PORT: Final[int] = 3306
DB_NAME: Final[str] = "Student_DB"

#Boolean Constants

DEBUG_MODE: Final[bool] = False
IS_PRODUCTION: Final[bool] = True

#Api and file constants
BASE_URL: Final[str] = "https://api.example.com"
CONFIG_FLE: Final[str] = "config.json"

#Http status code
class Status(Enum):
    SUCCESS = 200
    NOT_FOUND = 404
    BAD_REQUEST = 401

