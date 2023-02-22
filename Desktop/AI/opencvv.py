import cv2
import numpy as np

 # JPG, PNG 확장자로 사진을 가져오는것 해결해야함 
img = cv2.imread('1.png', 0)

img = cv2.medianBlur(img, 5)
cimg = cv2.cvtColor(img, cv2.COLOR_BAYER_BG2BGR)


circle = cv2.HoughCircles(img, cv2.HOUGH_GRADIENT,1 , 20, 
                          param1=50, param2=30,
                          minRadius=0, maxRadius=0)
circle = np.uint16(np.around(circle))

for i in circle[0,:]:
    cv2.circle(cimg,(i[0],i[1]),i[2], (0,255,0),2)
    cv2.circle(cimg,(i[0],i[1]),2, (0,255),3)
    cv2.imshow('detected circles', cimg)
    cv2.waitKey(0)

import easyocr
import cv2
import matplotlib.pyplot as plot
import numpy as np

IMG_P= 'sign.png'

reader = easyocr.Reader(['en'])
RST = reader.readtext(IMG_P)
RST

font = cv2.FONT_HERSHEY_SIMPLEX

IMG = cv2.imread(IMG_P)
spacer = 100
for detection in RST:
    T_LEFT = tuple(detection[0][0])
    B_RIGHT = tuple(detection[0][2])
    TEXT = detection[1]
    IMG = cv2.rectangle(IMG,T_LEFT,B_RIGHT,(0,255,0),3)
    IMG = cv2.putText(IMG,TEXT,(20,spacer), font, 0.5,(0,255,0),2,cv2.LINE_AA)
    spacer+=15

plot.imshow(IMG)
plot.show()