def switch(folge, i, j):
    temp = folge[i]
    folge[i] = folge[j]
    folge[j] = temp


def quicksort(folge, left, right):
    pivot = folge[right]
    indexLeft = left
    indexRight = right-1
    while indexLeft < indexRight:
        while folge[indexLeft] <= pivot:
                indexLeft += 1
        while folge[indexRight] >= pivot:
                indexRight -= 1
        if indexLeft < indexRight:
            switch(folge, indexLeft, indexRight)

    #Pivot tauschen
    if len(folge) > 2:
        switch(folge, indexLeft, right)

    # Rekursion
    if len(folge[left:indexLeft])>1:
        quicksort(Feld,left,indexLeft-1)
    if len(folge[indexLeft+1:right+1])>1:
        quicksort(Feld,indexLeft+1,right)



Feld = [45,5864,485,87,16354,79874,89546,74894,7,54,45,5,885,74]
print(Feld)
quicksort(Feld,0,len(Feld)-1)
print(Feld)
