//
// Created by universe on 2017/5/11.
//

#ifndef PRODUCT_H
#define PRODUCT_H


class Product{

    public:
        virtual ~Product()=0;

    protected:
    Product();

    private:

};

class ConcreteProduct: public Product{
    public:
           ~ConcreteProduct();
            ConcreteProduct();

    protected:
    private:
};


#endif