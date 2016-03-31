package qotd
class QuoteController {
def index = { 
redirect (action: home)
}
def home = {
render "<h1>Anees is a real programmer</h1>"
}
}
