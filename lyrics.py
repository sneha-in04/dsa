l="""Just one more tear to cry
One teardrop from my eye
You better save it for
The middle of the night
When things aren't black and white
Enter, Troubadour
Remember twenty-four?
And when I'm back in Chicago, I feel it
Another version of me, I was in it
I wave goodbye to the end of beginning
This song has started now
And you're just finding out
Now isn't that a laugh?
A major sacrifice
But clueless at the time
Enter, Caroline
Just trust me, you'll be fine
And when I'm back in Chicago, I feel it
Another version of me, I was in it
I wave goodbye to the end of beginning
(Goodbye, goodbye, goodbye, goodbye)
You take the man out of the city, not the city out the man
You take the man out of the city, not the city out the man
You take the man out of the city, not the city out the man
You take the man out of the
And when I'm back in Chicago, I feel it
Another version of me, I was in it
Oh, I wave goodbye to the end of beginning"""
m=l.split()
print(m)
d={}
for i in m:
    if i in d:
        d[i]=d[i]+1
    else:
        d[i]=1
print(d)
a=len(d)
print(a)
m=max(d.values())
for i in d:
    if d[i]==m:
        print(i)  