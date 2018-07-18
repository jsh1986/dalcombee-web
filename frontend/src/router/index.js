import Vue from 'vue'
import Router from 'vue-router'
import Intro from '@/components/Intro'
import Hello from '@/components/Hello'
import Service from '@/components/Service'
import Bootstrap from '@/components/Bootstrap'
import User from '@/components/User'
import TodoList from '@/components/todo/TodoList'
import CashList from '@/components/cash/CashList'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Intro',
      component: Intro
    },
    {
      path: '/hello',
      name: 'Hello',
      component: Hello
    },
    {
      path: '/callservice',
      name: 'Service',
      component: Service
    },
    {
      path: '/bootstrap',
      name: 'Bootstrap',
      component: Bootstrap
    },
    {
      path: '/user',
      name: 'User',
      component: User
    },
    {
      path: '/todo',
      name: 'TodoList',
      component: TodoList
    },
    {
      path: '/cash',
      name: 'CashList',
      component: CashList
    }
  ]
})
