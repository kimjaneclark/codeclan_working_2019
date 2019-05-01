from flask import Flask
from helpers import calculator
app = Flask(__name__)

@app.route("/")
def hello():
    return "Hello World!"

@app.route("/add/<a>/<b>")
def add(a, b):
    a = int(a)
    b = int(b)
    return str(calculator.add(a, b))

@app.route("/subtract/<a>/<b>")
def subtract(a,b):
    a = int(a)
    b = int(b)
    return str(calculator.subtract(a,b))

@app.route("/divide/<a>/<b>")
def divide(a,b):
    a = int(a)
    b = int(b)
    return str(calculator.divide(a,b))

@app.route("/multiply/<a>/<b>")
def multiply(a,b):
    a = int(a)
    b = int(b)
    return str(calculator.multiply(a,b))
