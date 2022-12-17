#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>
#include "lab2.h"


int** read_board_from_file(char* filename){
    FILE *fp = NULL;
    int** board = NULL;
    int i,j;

    fp= fopen("valid_board.txt","r");
        for(i=0;i<ROW_SIZE;i++)
        {
            for(j=0;j<COL_SIZE;j++)
                fscanf(fp,"%d", &board[i][j]);
            fscanf(fp,"\n");
        }
        fclose(fp);



    // replace this comment with your code

    return board;
}


int is_board_valid(){
    pthread_t* tid;  /* the thread identifiers */
    pthread_attr_t attr;
    param_struct* parameter;

    // replace this comment with your code
    thread_t* tid = (thread_t*)malloc(sizeof(int)*NUM_OF_THREADS);

    params[0].id = 0;
    params[0].starting_row=0;
    params[0].starting_col=0;
    params[0].starting_row=3;
    params[0].starting_row=3;

    pthread_create(&(tid[1]),&attr,validate, &(params[1]));
    params[1].id = 1;
    params[1].starting_row=0;
    params[1].starting_col=0;
    params[1].starting_row=3;
    params[1].starting_row=3;

    pthread_create(&(tid[1]),&attr,validate, &(params[1]));

    params[2].id = 2//
    parans[2].starting_row=0;
    params[2].starting_col=0;
    params[2].starting_row=0;
    params[2].starting_row=0;

    pthread_create(&(tid[2]),&attr,validate, &(params[2]));

    params[3].id = 3;
    params[3].starting_row=0;
    params[3].starting_col=0;
    params[3].starting_row=0;
    params[3].starting_row=3;

    pthread_create(&(tid[3]),&attr,validate, &(params[3]));

    params[4].id = 4;
    params[4].starting_row=0;
    params[4].starting_col=0;
    params[4].starting_row=0;
    params[4].starting_row=6;

    pthread_create(&(tid[4]),&attr,validate, &(params[4]));

    params[5].id = 5;
    params[5].starting_row=0;
    params[5].starting_col=0;
    params[5].starting_row=3;
    params[5].starting_row=3;

    pthread_create(&(tid[5]),&attr,validate, &(params[5]));

    params[6].id = 6;
    params[6].starting_row=0;
    params[6].starting_col=0;
    params[6].starting_row=3;
    params[6].starting_row=6;

    pthread_create(&(tid[6]),&attr,validate, &(params[6]));

    params[7].id = 7;
    params[7].starting_row=0;
    params[7].starting_col=0;
    params[7].starting_row=6;
    params[7].starting_row=0;

    pthread_create(&(tid[7]),&attr,validate, &(params[7]));

    params[8].id = 8;
    params[8].starting_row=0;
    params[8].starting_col=0;
    params[8].starting_row=6;
    params[8].starting_row=3;

    pthread_create(&(tid[8]),&attr,validate, &(params[8]));

    params[9].id = 9;
    params[9].starting_row=0;
    params[9].starting_col=0;
    params[9].starting_row=6;
    params[9].starting_row=6;

    pthread_create(&(tid[9]),&attr,validate, &(params[9]));



    while (v<11){
        if(valid[k]==1){
            k++;
        }
        else{
            printf("Valid");
            exit(0);
        }
    }
    printf("Not valid");
    return 0;
}




