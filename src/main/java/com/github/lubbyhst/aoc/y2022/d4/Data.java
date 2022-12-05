package com.github.lubbyhst.aoc.y2022.d4;

public class Data {
    public static final String rawData = "7-50,8-33\n" +
            "76-83,77-87\n" +
            "68-73,55-68\n" +
            "13-37,12-25\n" +
            "7-7,12-96\n" +
            "9-22,10-12\n" +
            "52-77,12-52\n" +
            "43-83,44-60\n" +
            "33-90,78-89\n" +
            "10-10,9-50\n" +
            "6-89,7-98\n" +
            "10-11,11-60\n" +
            "8-75,7-94\n" +
            "23-23,23-23\n" +
            "65-78,23-64\n" +
            "5-97,96-96\n" +
            "93-96,76-80\n" +
            "15-47,14-16\n" +
            "16-17,17-43\n" +
            "28-39,8-41\n" +
            "40-70,40-41\n" +
            "32-89,57-88\n" +
            "39-76,40-64\n" +
            "13-96,55-69\n" +
            "56-80,57-81\n" +
            "57-82,58-82\n" +
            "57-57,44-58\n" +
            "33-54,33-53\n" +
            "9-91,91-96\n" +
            "58-68,33-57\n" +
            "6-65,4-5\n" +
            "2-88,3-88\n" +
            "23-69,23-98\n" +
            "1-99,2-60\n" +
            "15-70,15-71\n" +
            "45-67,2-68\n" +
            "37-64,5-59\n" +
            "3-79,2-79\n" +
            "38-83,38-83\n" +
            "4-4,5-98\n" +
            "43-74,43-75\n" +
            "4-99,2-5\n" +
            "31-42,42-42\n" +
            "24-28,27-30\n" +
            "2-80,2-81\n" +
            "33-66,30-62\n" +
            "80-93,80-80\n" +
            "30-81,81-93\n" +
            "17-96,16-84\n" +
            "48-86,47-62\n" +
            "62-74,61-74\n" +
            "8-37,37-67\n" +
            "22-98,21-98\n" +
            "29-29,29-58\n" +
            "27-85,5-85\n" +
            "95-98,1-96\n" +
            "99-99,24-97\n" +
            "19-22,21-83\n" +
            "34-82,82-83\n" +
            "13-76,31-92\n" +
            "44-86,77-85\n" +
            "15-47,15-47\n" +
            "25-54,26-55\n" +
            "20-38,3-37\n" +
            "3-15,4-74\n" +
            "78-78,19-78\n" +
            "15-25,18-24\n" +
            "71-87,86-86\n" +
            "9-99,99-99\n" +
            "25-68,24-24\n" +
            "42-89,31-42\n" +
            "47-67,48-74\n" +
            "34-61,20-34\n" +
            "2-80,1-3\n" +
            "5-6,5-74\n" +
            "4-67,5-53\n" +
            "20-20,21-88\n" +
            "7-48,5-8\n" +
            "14-62,14-14\n" +
            "49-79,42-78\n" +
            "23-28,22-22\n" +
            "21-87,21-86\n" +
            "57-95,57-95\n" +
            "36-53,12-77\n" +
            "12-46,13-57\n" +
            "52-84,85-88\n" +
            "41-73,73-73\n" +
            "84-94,64-95\n" +
            "93-94,12-94\n" +
            "1-99,1-99\n" +
            "6-6,6-70\n" +
            "3-99,7-98\n" +
            "96-99,3-97\n" +
            "18-84,17-85\n" +
            "56-99,8-57\n" +
            "7-83,8-84\n" +
            "51-82,50-83\n" +
            "7-77,7-8\n" +
            "58-76,59-77\n" +
            "13-79,14-79\n" +
            "7-7,8-85\n" +
            "15-17,16-28\n" +
            "17-79,16-79\n" +
            "74-74,1-73\n" +
            "28-28,28-65\n" +
            "59-62,59-66\n" +
            "48-69,46-47\n" +
            "14-23,3-24\n" +
            "35-83,83-98\n" +
            "55-84,55-83\n" +
            "10-20,7-19\n" +
            "13-88,21-88\n" +
            "62-62,62-85\n" +
            "32-32,33-33\n" +
            "49-86,15-90\n" +
            "2-3,2-38\n" +
            "1-1,2-93\n" +
            "40-52,22-41\n" +
            "41-82,82-92\n" +
            "42-79,41-59\n" +
            "53-99,52-99\n" +
            "52-68,6-55\n" +
            "30-65,31-65\n" +
            "56-90,8-91\n" +
            "83-93,17-82\n" +
            "5-84,4-70\n" +
            "56-56,56-97\n" +
            "5-44,4-81\n" +
            "85-91,90-90\n" +
            "23-51,22-22\n" +
            "12-15,14-68\n" +
            "28-28,28-84\n" +
            "1-6,10-32\n" +
            "5-86,50-88\n" +
            "8-20,19-19\n" +
            "62-80,62-81\n" +
            "50-77,76-97\n" +
            "3-97,3-96\n" +
            "14-77,37-39\n" +
            "82-84,29-82\n" +
            "6-31,1-24\n" +
            "62-71,46-61\n" +
            "13-13,11-15\n" +
            "3-9,4-17\n" +
            "32-97,11-98\n" +
            "89-90,23-89\n" +
            "51-59,48-60\n" +
            "53-74,53-74\n" +
            "30-30,29-71\n" +
            "8-70,8-9\n" +
            "65-65,65-66\n" +
            "34-85,96-99\n" +
            "36-40,36-36\n" +
            "42-42,42-72\n" +
            "2-43,33-69\n" +
            "4-31,30-77\n" +
            "69-84,70-92\n" +
            "26-95,27-98\n" +
            "3-3,6-89\n" +
            "34-88,51-79\n" +
            "63-63,3-63\n" +
            "8-8,8-61\n" +
            "30-87,13-84\n" +
            "38-38,37-50\n" +
            "24-87,10-93\n" +
            "6-88,3-4\n" +
            "19-70,19-69\n" +
            "36-92,31-37\n" +
            "17-94,14-18\n" +
            "56-61,49-74\n" +
            "30-62,29-62\n" +
            "20-25,21-87\n" +
            "12-76,12-12\n" +
            "94-96,54-95\n" +
            "1-99,4-77\n" +
            "40-40,16-41\n" +
            "72-90,14-73\n" +
            "8-93,7-92\n" +
            "10-95,41-98\n" +
            "29-36,19-51\n" +
            "79-93,70-94\n" +
            "11-18,17-95\n" +
            "3-97,2-98\n" +
            "52-67,53-53\n" +
            "13-46,12-45\n" +
            "5-68,4-94\n" +
            "16-73,15-15\n" +
            "11-40,33-33\n" +
            "76-83,82-85\n" +
            "28-35,40-92\n" +
            "53-93,12-83\n" +
            "2-61,58-60\n" +
            "4-51,4-4\n" +
            "18-43,17-56\n" +
            "93-93,14-93\n" +
            "95-98,16-96\n" +
            "32-39,36-41\n" +
            "9-73,6-9\n" +
            "55-55,36-56\n" +
            "20-98,20-99\n" +
            "2-58,18-99\n" +
            "5-6,9-75\n" +
            "21-90,77-82\n" +
            "88-99,7-89\n" +
            "21-44,14-38\n" +
            "82-97,69-82\n" +
            "12-12,13-87\n" +
            "46-81,98-99\n" +
            "15-82,14-83\n" +
            "12-51,11-12\n" +
            "3-94,4-94\n" +
            "9-33,10-86\n" +
            "20-93,19-50\n" +
            "27-84,53-83\n" +
            "79-80,3-79\n" +
            "73-90,78-89\n" +
            "96-96,93-98\n" +
            "93-98,54-93\n" +
            "33-82,6-33\n" +
            "1-9,9-27\n" +
            "14-14,15-63\n" +
            "4-94,5-95\n" +
            "16-90,15-90\n" +
            "47-78,47-79\n" +
            "4-75,3-75\n" +
            "3-96,96-99\n" +
            "38-66,19-92\n" +
            "16-56,12-14\n" +
            "37-47,46-47\n" +
            "4-70,1-70\n" +
            "26-58,48-72\n" +
            "38-97,43-93\n" +
            "76-84,76-78\n" +
            "13-55,5-14\n" +
            "66-78,62-92\n" +
            "42-87,41-86\n" +
            "3-21,4-62\n" +
            "10-63,9-63\n" +
            "9-67,8-67\n" +
            "10-92,92-92\n" +
            "96-98,79-95\n" +
            "19-53,99-99\n" +
            "4-64,4-63\n" +
            "46-60,14-59\n" +
            "2-90,1-89\n" +
            "16-25,9-11\n" +
            "8-98,8-97\n" +
            "3-92,3-91\n" +
            "65-87,64-88\n" +
            "4-67,3-4\n" +
            "66-88,78-87\n" +
            "14-82,76-81\n" +
            "12-85,11-84\n" +
            "30-53,12-52\n" +
            "53-60,7-61\n" +
            "73-73,5-73\n" +
            "55-55,55-57\n" +
            "14-16,10-15\n" +
            "23-29,22-22\n" +
            "64-82,38-63\n" +
            "38-68,69-69\n" +
            "9-79,10-56\n" +
            "43-87,42-88\n" +
            "30-63,31-62\n" +
            "25-25,24-83\n" +
            "31-31,31-75\n" +
            "2-96,17-99\n" +
            "31-37,35-36\n" +
            "3-42,2-43\n" +
            "82-97,19-82\n" +
            "38-94,95-97\n" +
            "1-87,88-99\n" +
            "47-87,46-84\n" +
            "4-54,53-55\n" +
            "80-96,3-81\n" +
            "5-5,4-98\n" +
            "35-50,24-36\n" +
            "7-78,12-94\n" +
            "45-70,69-73\n" +
            "32-32,32-63\n" +
            "61-71,39-72\n" +
            "35-35,34-35\n" +
            "80-81,22-82\n" +
            "34-62,5-34\n" +
            "19-21,18-19\n" +
            "24-87,25-87\n" +
            "34-97,34-98\n" +
            "5-91,64-92\n" +
            "19-49,19-98\n" +
            "27-50,49-51\n" +
            "10-70,69-71\n" +
            "10-66,66-66\n" +
            "66-99,65-66\n" +
            "3-33,32-53\n" +
            "23-32,8-34\n" +
            "90-91,37-90\n" +
            "41-77,53-76\n" +
            "57-57,30-57\n" +
            "35-37,36-48\n" +
            "46-86,46-67\n" +
            "60-83,60-61\n" +
            "15-21,35-56\n" +
            "60-91,60-91\n" +
            "12-30,3-29\n" +
            "89-90,82-92\n" +
            "24-53,25-53\n" +
            "13-60,14-61\n" +
            "44-45,41-48\n" +
            "24-94,93-94\n" +
            "28-59,60-85\n" +
            "94-98,66-93\n" +
            "11-94,46-93\n" +
            "89-93,44-89\n" +
            "72-93,30-72\n" +
            "22-40,23-35\n" +
            "14-94,15-97\n" +
            "51-86,48-76\n" +
            "90-90,66-91\n" +
            "58-74,10-71\n" +
            "27-34,36-42\n" +
            "1-96,96-97\n" +
            "25-94,24-24\n" +
            "9-28,1-10\n" +
            "14-15,15-92\n" +
            "5-26,25-25\n" +
            "98-99,32-98\n" +
            "12-71,11-11\n" +
            "77-81,80-96\n" +
            "30-66,40-65\n" +
            "26-54,33-53\n" +
            "17-78,18-18\n" +
            "9-94,9-10\n" +
            "87-95,37-88\n" +
            "15-93,86-92\n" +
            "30-82,29-82\n" +
            "58-93,57-71\n" +
            "20-75,60-67\n" +
            "1-89,88-88\n" +
            "19-95,19-94\n" +
            "13-95,12-14\n" +
            "34-67,33-67\n" +
            "35-97,31-35\n" +
            "54-99,54-98\n" +
            "6-92,18-36\n" +
            "31-59,30-30\n" +
            "1-75,74-81\n" +
            "44-47,45-45\n" +
            "26-75,3-26\n" +
            "35-36,36-71\n" +
            "7-7,8-29\n" +
            "32-88,33-74\n" +
            "11-66,47-65\n" +
            "29-93,28-94\n" +
            "79-85,20-78\n" +
            "8-60,52-60\n" +
            "39-41,40-80\n" +
            "4-90,6-90\n" +
            "49-86,87-87\n" +
            "8-8,9-99\n" +
            "7-59,10-92\n" +
            "30-93,11-30\n" +
            "16-31,30-30\n" +
            "33-62,33-33\n" +
            "10-25,10-24\n" +
            "15-59,40-85\n" +
            "16-94,94-95\n" +
            "1-2,1-99\n" +
            "77-91,54-78\n" +
            "10-76,34-72\n" +
            "2-90,2-89\n" +
            "26-54,23-58\n" +
            "3-82,2-99\n" +
            "20-65,21-21\n" +
            "42-67,31-43\n" +
            "18-51,3-19\n" +
            "9-73,52-72\n" +
            "19-40,18-41\n" +
            "53-66,65-72\n" +
            "3-99,76-97\n" +
            "73-73,15-73\n" +
            "11-15,11-11\n" +
            "20-71,20-72\n" +
            "60-74,54-75\n" +
            "6-91,8-90\n" +
            "35-52,35-53\n" +
            "17-94,96-96\n" +
            "8-84,30-65\n" +
            "21-82,16-22\n" +
            "84-89,43-90\n" +
            "41-81,41-80\n" +
            "39-48,38-94\n" +
            "13-59,13-60\n" +
            "39-40,40-86\n" +
            "11-11,10-90\n" +
            "76-76,68-76\n" +
            "26-93,25-27\n" +
            "78-94,68-77\n" +
            "88-95,7-88\n" +
            "3-20,19-74\n" +
            "88-93,25-65\n" +
            "6-6,6-51\n" +
            "12-15,22-97\n" +
            "18-22,18-19\n" +
            "65-84,65-84\n" +
            "37-94,34-35\n" +
            "8-28,7-36\n" +
            "53-83,53-55\n" +
            "3-99,4-79\n" +
            "2-43,31-43\n" +
            "52-68,52-84\n" +
            "12-53,11-11\n" +
            "69-74,64-75\n" +
            "4-5,5-98\n" +
            "11-47,12-21\n" +
            "61-87,88-89\n" +
            "3-3,4-98\n" +
            "24-80,83-86\n" +
            "2-55,1-54\n" +
            "92-92,46-92\n" +
            "14-26,14-27\n" +
            "3-57,1-4\n" +
            "57-64,56-92\n" +
            "78-78,11-78\n" +
            "48-48,49-90\n" +
            "79-80,53-80\n" +
            "7-53,8-47\n" +
            "48-81,47-75\n" +
            "28-88,27-87\n" +
            "12-66,12-66\n" +
            "29-92,37-92\n" +
            "10-99,98-99\n" +
            "58-72,57-73\n" +
            "24-78,77-83\n" +
            "1-24,23-83\n" +
            "30-57,57-82\n" +
            "39-72,40-46\n" +
            "8-85,7-86\n" +
            "24-43,24-40\n" +
            "1-98,1-99\n" +
            "35-79,35-80\n" +
            "54-68,67-76\n" +
            "6-89,4-90\n" +
            "99-99,13-69\n" +
            "5-5,6-42\n" +
            "3-88,27-89\n" +
            "91-91,2-92\n" +
            "32-69,34-68\n" +
            "53-79,53-85\n" +
            "21-22,22-88\n" +
            "10-69,7-11\n" +
            "3-81,9-68\n" +
            "7-42,3-86\n" +
            "52-58,57-69\n" +
            "44-74,42-74\n" +
            "3-22,4-18\n" +
            "20-62,62-92\n" +
            "84-87,20-85\n" +
            "3-69,3-3\n" +
            "40-48,47-67\n" +
            "9-9,8-99\n" +
            "3-92,2-10\n" +
            "20-20,18-20\n" +
            "5-93,7-93\n" +
            "52-76,15-77\n" +
            "14-87,14-88\n" +
            "43-46,44-49\n" +
            "2-3,6-92\n" +
            "28-66,24-82\n" +
            "2-88,3-87\n" +
            "43-87,42-92\n" +
            "2-3,3-95\n" +
            "45-49,44-50\n" +
            "30-83,29-82\n" +
            "24-81,25-57\n" +
            "76-77,77-77\n" +
            "18-85,4-90\n" +
            "57-57,19-57\n" +
            "9-99,3-10\n" +
            "45-50,44-50\n" +
            "3-99,2-79\n" +
            "38-61,41-62\n" +
            "63-87,64-87\n" +
            "1-86,98-98\n" +
            "51-58,50-54\n" +
            "31-41,31-31\n" +
            "20-85,10-19\n" +
            "8-97,8-8\n" +
            "16-64,64-89\n" +
            "1-4,3-92\n" +
            "12-68,13-69\n" +
            "45-46,46-90\n" +
            "84-98,53-84\n" +
            "32-49,46-48\n" +
            "55-93,55-92\n" +
            "3-4,6-21\n" +
            "6-99,3-7\n" +
            "52-90,19-88\n" +
            "7-7,8-85\n" +
            "53-95,53-53\n" +
            "69-87,68-88\n" +
            "33-34,15-34\n" +
            "22-38,4-39\n" +
            "67-83,68-68\n" +
            "52-89,53-68\n" +
            "30-85,53-84\n" +
            "26-94,26-95\n" +
            "11-37,11-96\n" +
            "86-92,17-93\n" +
            "33-78,33-78\n" +
            "9-81,80-80\n" +
            "46-53,53-53\n" +
            "44-63,62-98\n" +
            "1-78,1-78\n" +
            "31-61,16-29\n" +
            "16-88,16-96\n" +
            "9-51,9-50\n" +
            "34-53,35-54\n" +
            "18-98,18-18\n" +
            "31-66,6-16\n" +
            "28-35,36-52\n" +
            "98-99,60-97\n" +
            "25-35,25-25\n" +
            "60-90,84-89\n" +
            "13-15,1-21\n" +
            "2-23,2-24\n" +
            "2-91,90-93\n" +
            "25-32,31-80\n" +
            "55-62,56-63\n" +
            "24-43,42-91\n" +
            "63-82,62-84\n" +
            "5-9,31-87\n" +
            "47-63,48-76\n" +
            "62-88,62-87\n" +
            "26-73,26-72\n" +
            "25-41,26-42\n" +
            "10-77,76-76\n" +
            "82-87,2-83\n" +
            "1-96,1-97\n" +
            "9-56,18-55\n" +
            "2-93,3-92\n" +
            "58-94,62-97\n" +
            "71-97,12-69\n" +
            "15-91,90-90\n" +
            "49-60,50-60\n" +
            "73-84,83-83\n" +
            "57-91,10-58\n" +
            "12-70,11-69\n" +
            "3-53,52-67\n" +
            "13-94,94-96\n" +
            "90-92,2-68\n" +
            "4-74,74-82\n" +
            "16-95,20-97\n" +
            "17-30,17-31\n" +
            "41-50,5-28\n" +
            "18-34,17-98\n" +
            "37-66,15-99\n" +
            "2-43,1-1\n" +
            "1-58,38-70\n" +
            "5-7,6-24\n" +
            "38-54,54-63\n" +
            "6-20,5-7\n" +
            "72-93,83-90\n" +
            "89-90,34-89\n" +
            "8-18,7-14\n" +
            "1-54,2-53\n" +
            "45-87,45-46\n" +
            "6-24,5-5\n" +
            "5-81,1-3\n" +
            "4-5,4-97\n" +
            "38-38,38-70\n" +
            "4-91,5-98\n" +
            "52-69,51-53\n" +
            "18-45,18-44\n" +
            "99-99,4-99\n" +
            "32-93,35-93\n" +
            "25-95,15-30\n" +
            "35-38,34-75\n" +
            "25-29,26-64\n" +
            "30-51,30-52\n" +
            "36-37,37-40\n" +
            "14-81,13-15\n" +
            "19-85,18-85\n" +
            "15-88,16-16\n" +
            "21-96,22-95\n" +
            "29-31,30-68\n" +
            "22-85,22-48\n" +
            "19-84,18-79\n" +
            "63-63,24-64\n" +
            "51-79,51-80\n" +
            "21-38,37-44\n" +
            "19-72,4-18\n" +
            "30-95,30-94\n" +
            "1-88,89-98\n" +
            "4-5,4-83\n" +
            "95-97,74-95\n" +
            "2-83,83-83\n" +
            "89-94,93-98\n" +
            "27-93,19-28\n" +
            "43-43,44-88\n" +
            "86-89,87-87\n" +
            "1-3,5-66\n" +
            "98-99,59-97\n" +
            "4-80,5-21\n" +
            "5-5,4-85\n" +
            "15-82,16-97\n" +
            "49-50,48-49\n" +
            "8-89,89-90\n" +
            "14-15,15-25\n" +
            "42-48,47-49\n" +
            "9-48,8-10\n" +
            "21-84,21-83\n" +
            "97-99,1-97\n" +
            "22-90,90-95\n" +
            "18-73,72-76\n" +
            "87-91,68-80\n" +
            "21-22,22-44\n" +
            "5-91,90-97\n" +
            "25-97,96-98\n" +
            "8-22,1-7\n" +
            "4-77,4-30\n" +
            "43-43,44-64\n" +
            "43-43,43-88\n" +
            "39-56,40-57\n" +
            "15-90,16-71\n" +
            "25-78,85-97\n" +
            "27-78,26-79\n" +
            "61-70,66-67\n" +
            "8-94,96-98\n" +
            "11-16,30-89\n" +
            "9-55,9-54\n" +
            "53-92,53-54\n" +
            "1-98,1-99\n" +
            "29-30,31-76\n" +
            "81-83,27-80\n" +
            "75-85,75-85\n" +
            "18-94,11-12\n" +
            "2-11,11-93\n" +
            "1-4,3-84\n" +
            "2-62,1-61\n" +
            "2-96,2-95\n" +
            "1-87,86-88\n" +
            "71-78,75-75\n" +
            "96-96,6-97\n" +
            "6-8,8-44\n" +
            "64-86,85-99\n" +
            "3-11,9-11\n" +
            "31-92,14-92\n" +
            "8-96,14-97\n" +
            "6-94,5-93\n" +
            "5-67,5-66\n" +
            "10-14,13-92\n" +
            "14-74,13-73\n" +
            "21-96,96-97\n" +
            "56-66,62-65\n" +
            "7-77,7-77\n" +
            "88-92,18-73\n" +
            "9-63,19-93\n" +
            "1-84,18-84\n" +
            "12-85,9-12\n" +
            "28-28,29-94\n" +
            "18-37,17-36\n" +
            "20-93,93-94\n" +
            "33-52,4-60\n" +
            "35-93,65-82\n" +
            "27-27,27-67\n" +
            "22-92,22-77\n" +
            "45-50,45-64\n" +
            "8-99,8-98\n" +
            "1-1,2-90\n" +
            "4-62,5-63\n" +
            "22-44,4-45\n" +
            "92-94,14-95\n" +
            "3-95,39-94\n" +
            "29-96,95-95\n" +
            "21-96,21-95\n" +
            "65-71,66-91\n" +
            "88-94,58-89\n" +
            "13-84,1-83\n" +
            "13-87,12-86\n" +
            "29-48,28-36\n" +
            "6-90,6-89\n" +
            "37-70,36-38\n" +
            "20-79,21-80\n" +
            "32-89,30-89\n" +
            "8-76,8-8\n" +
            "52-74,51-75\n" +
            "6-89,5-89\n" +
            "59-77,60-76\n" +
            "35-83,35-35\n" +
            "52-78,49-98\n" +
            "39-88,22-35\n" +
            "27-32,27-27\n" +
            "13-50,12-13\n" +
            "61-61,61-61\n" +
            "13-85,12-14\n" +
            "17-25,26-95\n" +
            "57-71,41-73\n" +
            "50-76,49-49\n" +
            "87-87,18-88\n" +
            "95-95,41-96\n" +
            "53-54,52-53\n" +
            "6-44,5-98\n" +
            "1-88,88-93\n" +
            "13-29,29-81\n" +
            "9-70,3-6\n" +
            "92-97,41-92\n" +
            "14-48,3-5\n" +
            "2-5,3-20\n" +
            "39-83,55-83\n" +
            "83-83,8-83\n" +
            "14-52,2-15\n" +
            "7-64,8-63\n" +
            "50-76,50-77\n" +
            "1-78,1-77\n" +
            "3-80,2-2\n" +
            "96-96,47-96\n" +
            "99-99,65-99\n" +
            "52-74,9-53\n" +
            "25-53,25-54\n" +
            "18-18,18-73\n" +
            "47-52,16-48\n" +
            "83-88,83-88\n" +
            "3-7,6-75\n" +
            "8-93,9-76\n" +
            "57-57,30-59\n" +
            "61-61,62-96\n" +
            "73-88,73-88\n" +
            "17-41,11-40\n" +
            "49-49,48-69\n" +
            "1-62,1-54\n" +
            "15-26,15-45\n" +
            "6-56,5-5\n" +
            "4-99,2-3\n" +
            "15-89,88-93\n" +
            "22-22,17-22\n" +
            "12-85,12-12\n" +
            "89-99,62-90\n" +
            "53-95,53-95\n" +
            "4-64,10-74\n" +
            "6-42,4-6\n" +
            "11-41,20-22\n" +
            "49-50,48-49\n" +
            "11-85,12-84\n" +
            "32-32,26-31\n" +
            "40-67,8-39\n" +
            "17-17,16-93\n" +
            "12-54,13-55\n" +
            "43-44,43-43\n" +
            "33-35,34-93\n" +
            "2-8,7-64\n" +
            "30-91,31-91\n" +
            "70-70,15-74\n" +
            "36-36,36-80\n" +
            "23-23,3-24\n" +
            "18-40,25-40\n" +
            "36-99,35-45\n" +
            "45-83,83-84\n" +
            "90-90,9-91\n" +
            "24-25,23-23\n" +
            "12-91,11-90\n" +
            "30-37,30-38\n" +
            "24-94,25-98\n" +
            "30-67,29-29\n" +
            "4-50,8-51\n" +
            "63-95,14-85\n" +
            "14-14,15-32\n" +
            "2-3,2-86\n" +
            "27-41,26-42\n" +
            "6-86,86-86\n" +
            "34-70,34-69\n" +
            "89-97,2-90\n" +
            "59-75,59-74\n" +
            "58-94,58-93\n" +
            "6-75,2-75\n" +
            "44-73,43-45\n" +
            "50-61,50-70\n" +
            "6-92,7-7\n" +
            "34-88,35-92\n" +
            "2-96,97-99\n" +
            "10-91,10-91\n" +
            "1-94,2-23\n" +
            "21-40,21-39\n" +
            "19-87,87-95\n" +
            "6-75,2-18\n" +
            "22-72,15-73\n" +
            "9-96,42-96\n" +
            "16-16,16-87\n" +
            "27-84,26-83\n" +
            "94-97,2-94\n" +
            "45-58,56-56\n" +
            "10-16,22-71\n" +
            "34-55,43-78\n" +
            "94-98,9-99\n" +
            "1-90,89-95\n" +
            "1-84,29-85\n" +
            "13-70,70-71\n" +
            "58-86,4-87\n" +
            "1-41,41-55\n" +
            "36-71,37-72\n" +
            "65-68,45-69\n" +
            "30-30,31-31\n" +
            "35-69,35-68\n" +
            "58-94,58-95\n" +
            "10-94,93-98\n" +
            "53-94,23-54\n" +
            "47-51,48-48\n" +
            "7-86,7-7\n" +
            "28-44,23-29\n" +
            "7-73,6-7\n" +
            "5-88,5-88\n" +
            "10-92,9-9\n" +
            "18-71,17-72\n" +
            "7-16,15-78\n" +
            "41-42,42-78\n" +
            "9-32,8-96\n" +
            "51-52,32-52\n" +
            "24-76,23-87\n" +
            "2-99,2-2\n" +
            "95-95,1-95\n" +
            "42-92,92-92\n" +
            "21-85,88-93\n" +
            "75-75,1-75\n" +
            "70-71,3-72\n" +
            "39-87,32-42\n" +
            "1-1,3-85\n" +
            "55-57,56-70\n" +
            "16-39,15-16\n" +
            "25-26,26-87\n" +
            "14-79,33-73\n" +
            "53-64,14-53\n" +
            "96-99,2-97\n" +
            "32-91,33-95\n" +
            "85-92,25-86\n" +
            "4-96,1-3\n" +
            "69-98,51-69\n" +
            "24-76,75-75\n" +
            "60-93,68-85\n" +
            "51-51,52-90\n" +
            "25-30,30-34\n" +
            "10-90,11-89\n" +
            "1-96,1-97\n" +
            "42-61,42-62\n" +
            "30-71,29-31\n" +
            "26-35,17-36\n" +
            "7-84,7-83\n" +
            "18-25,18-24\n" +
            "9-86,21-87\n" +
            "3-27,26-51\n" +
            "56-97,55-56\n" +
            "47-74,48-96\n" +
            "5-35,6-92\n" +
            "35-70,27-37\n" +
            "2-2,2-90\n" +
            "18-64,18-63\n" +
            "1-3,3-78\n" +
            "14-36,13-42\n" +
            "12-53,19-58\n" +
            "55-91,56-62\n" +
            "14-24,23-64\n" +
            "9-32,33-86\n" +
            "40-64,40-63\n" +
            "25-92,25-92\n" +
            "49-51,55-69\n" +
            "13-46,13-45\n" +
            "46-75,45-76\n" +
            "2-77,2-76\n" +
            "21-88,3-96\n" +
            "7-12,12-92\n" +
            "46-91,45-92\n" +
            "7-78,57-79\n" +
            "2-2,1-97\n" +
            "78-87,8-79\n" +
            "28-75,27-74\n" +
            "5-81,80-83\n" +
            "30-63,29-64\n" +
            "69-80,32-70\n" +
            "2-78,1-79\n" +
            "13-15,14-74\n" +
            "79-84,83-84\n" +
            "68-69,11-69\n" +
            "9-43,9-44\n" +
            "92-99,92-92\n" +
            "90-97,35-90\n" +
            "13-68,13-13\n" +
            "3-87,1-3\n" +
            "47-52,48-53\n" +
            "27-94,8-28\n" +
            "46-93,44-52\n" +
            "8-56,8-95\n" +
            "50-57,44-58\n" +
            "4-18,2-2\n" +
            "3-77,76-76\n" +
            "17-17,18-83\n" +
            "2-93,20-23\n" +
            "94-94,5-95\n" +
            "73-82,3-74\n" +
            "31-49,48-81\n" +
            "40-43,9-41\n" +
            "74-74,74-85\n" +
            "10-95,3-95\n" +
            "14-22,21-78\n" +
            "2-96,1-4\n" +
            "26-66,11-66\n" +
            "48-48,6-49\n" +
            "12-86,85-94\n" +
            "81-83,80-83\n" +
            "3-29,30-77\n" +
            "55-90,47-91\n" +
            "5-83,1-6\n" +
            "7-19,6-6\n" +
            "36-39,37-43\n" +
            "11-60,17-45\n" +
            "8-83,3-21\n" +
            "11-11,11-79\n" +
            "25-31,35-97\n" +
            "30-46,46-47\n" +
            "24-24,25-78\n" +
            "6-96,5-7\n" +
            "73-83,13-84\n" +
            "15-99,14-82\n" +
            "84-98,84-99\n" +
            "7-61,42-61\n" +
            "2-37,37-37\n" +
            "9-9,9-34\n" +
            "40-42,41-85\n" +
            "11-33,10-32\n" +
            "2-9,8-64\n" +
            "92-92,86-93\n" +
            "7-38,7-37\n" +
            "16-92,2-17\n" +
            "2-3,3-50\n" +
            "1-95,2-96\n" +
            "38-87,67-87\n" +
            "5-21,21-22\n" +
            "38-47,24-70\n" +
            "4-44,3-81\n" +
            "84-85,1-84\n" +
            "22-99,21-96\n" +
            "70-72,59-72\n" +
            "15-96,16-96\n" +
            "6-76,6-6\n" +
            "83-83,78-83\n" +
            "26-37,25-25\n" +
            "9-43,3-43\n" +
            "81-81,80-80\n" +
            "47-51,49-53\n" +
            "97-97,29-98\n" +
            "23-47,46-46\n" +
            "28-84,29-85\n" +
            "1-94,1-95\n" +
            "14-72,13-15\n" +
            "61-95,4-78\n" +
            "9-89,9-9\n" +
            "10-12,11-90\n" +
            "50-54,19-50\n" +
            "97-98,9-98\n" +
            "15-94,16-28\n" +
            "77-77,25-76\n" +
            "20-74,19-28\n" +
            "1-99,2-41\n" +
            "29-79,79-79\n" +
            "30-88,30-87\n" +
            "24-98,75-91\n" +
            "15-65,14-65\n" +
            "67-77,67-78\n" +
            "5-86,2-4\n" +
            "3-81,4-82\n" +
            "40-90,39-91\n" +
            "19-51,19-19\n" +
            "48-67,42-67\n" +
            "17-60,24-47\n" +
            "27-81,18-82\n" +
            "48-87,66-87\n" +
            "35-96,34-89\n" +
            "16-23,22-50\n" +
            "7-85,85-85\n" +
            "7-43,6-42\n" +
            "26-75,27-27\n" +
            "6-10,9-64\n" +
            "18-38,14-39\n" +
            "45-85,84-89\n" +
            "30-98,98-98\n" +
            "84-93,14-85\n" +
            "8-57,8-56\n" +
            "24-91,23-92\n" +
            "79-93,79-94\n" +
            "37-60,16-37\n" +
            "2-81,5-80\n" +
            "80-92,81-99\n" +
            "5-40,5-40\n" +
            "10-44,44-48\n" +
            "5-15,14-42\n" +
            "8-68,2-6\n" +
            "30-78,53-77\n" +
            "81-88,29-80\n" +
            "98-99,6-98\n" +
            "42-99,98-98\n" +
            "63-63,17-63\n" +
            "41-98,41-97\n" +
            "1-99,2-98";
}