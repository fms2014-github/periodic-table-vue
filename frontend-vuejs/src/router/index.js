import Vue from "vue";
import VueRouter from "vue-router";
import PeriodicTable from "@/views/PeriodicTable";
import AtomDetailInfo from "@/views/AtomDetailInfo";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: PeriodicTable,
  },
  {
    path: "/AtomDetailInfo/:atomName",
    name: "AtomDetailInfo",
    component: AtomDetailInfo,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
