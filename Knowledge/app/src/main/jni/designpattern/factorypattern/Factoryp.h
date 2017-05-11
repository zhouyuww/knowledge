//
// Created by universe on 2017/5/11.
//

#ifndef FACTORYP_H
#define FACTORYP_H
#include "Product.h"

class Factoryp{

    public:

        virtual ~Factoryp()=0;

        virtual  Product* CreateProduct()=0;


    protected:
        Factoryp();

    private:
};


class ConcreateFactory:public  Factoryp{

    public:
        ~ConcreateFactory();
         ConcreateFactory();

         Product* CreateProduct();

    protected:

    private:


};

#endif