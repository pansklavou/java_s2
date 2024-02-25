#hello_window

from tkinter import Tk , Button,Entry, Label


def button_clicked():
    print("Clicked!!")
    name=entry.get()
    label.configure(text="Hello "+name)





window = Tk()
window.geometry ("500x400")

button=Button(window, text= "Click me!", command=button_clicked)
button.grid(row=0, column=0)
entry=Entry(window)
entry.grid(row=1,column=0)
label=Label(window, text=("Please enter your name above:"))
label.grid(row=2,column=0)

window.mainloop()
