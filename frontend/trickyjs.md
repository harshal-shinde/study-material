# Tricky Questions

## How we can avoid stackoverflow ?
```
var list = readHugeList();
var nextListItem = function() {
    var item = list.pop();
    if (item) {
        // process the list item...
        nextListItem();
    }
};
```
Answer
```
Use settimeout to pass nextListItem to event loop instead of stack.Stack will remain clear
```
